package com.company;

class SimpsonMethod
{
    double xFunc(double top, double bottom, int parts)
    {
        double step = (top - bottom) / parts;
        double evenNode = 0;
        double oddNode = 0;
        double ExtremeNodesSum;
        double NodeValue = bottom;
        ExtremeNodesSum = top + bottom;
        for (int stepNum = 1; stepNum < parts; stepNum++)
        {
            NodeValue += step;
            if (stepNum % 2 == 0)
            {
                evenNode += 2 * NodeValue;
            }
            if (stepNum % 2 != 0)
            {
                oddNode += 4 * NodeValue;
            }
        }
        double AllNodesSum = (ExtremeNodesSum + evenNode + oddNode);
        return (step / 3) * AllNodesSum;
    }
    double xRungeErr(double top, double bottom, double accuracy, int parts)
    {
        xFunc(top, bottom, parts * 2);
        double functionDesicion = xFunc(top, bottom, parts);
        double rungeError = xFunc(top, bottom, parts * 2);
        int multiplier = 4;
        if ((rungeError - functionDesicion) > accuracy)
        {
            while ((rungeError - functionDesicion) > accuracy)
            {
                rungeError = xFunc(top, bottom, parts * multiplier);
                multiplier *= 2;
                break;
            }
        }
        return rungeError - functionDesicion;
    }
    double sinFunc(double top, double bottom, int parts)
    {
        double step = (top - bottom) / parts;
        double evenNode = 0;
        double oddNode = 0;
        double ExtremeNodesSum;
        double NodeValue = bottom;
        ExtremeNodesSum = Math.sin(top) + Math.sin(bottom);
        for (int stepNum = 1; stepNum < parts; stepNum++)
        {
            NodeValue += step;
            if (stepNum % 2 == 0)
            {
                evenNode += 2 * Math.sin(NodeValue);
            }
            if (stepNum % 2 != 0)
            {
                oddNode += 4 * Math.sin(NodeValue);
            }
        }
        double AllNodesSum = (ExtremeNodesSum + evenNode + oddNode);
        return (step / 3) * AllNodesSum;
    }
    double sinRungeErr(double top, double bottom, double accuracy, int parts)
    {
        sinFunc(top, bottom, parts * 2);
        double functionDesicion = sinFunc(top, bottom, parts);
        double rungeError = sinFunc(top, bottom, parts * 2);
        int multiplier = 4;
        if ((rungeError - functionDesicion) > accuracy)
        {
            while ((rungeError - functionDesicion) > accuracy)
            {
                rungeError = sinFunc(top, bottom, parts * multiplier);
                multiplier *= 2;
                break;
            }
        }
        return rungeError - functionDesicion;
    }
    double cosFunc(double top, double bottom, int parts)
    {
        double step = (top - bottom) / parts;
        double evenNode = 0;
        double oddNode = 0;
        double ExtremeNodesSum;
        double NodeValue = bottom;
        ExtremeNodesSum = Math.cos(top) + Math.cos(bottom);
        for (int stepNum = 1; stepNum < parts; stepNum++)
        {
            NodeValue += step;
            if (stepNum % 2 == 0)
            {
                evenNode += 2 * Math.cos(NodeValue);
            }
            if (stepNum % 2 != 0)
            {
                oddNode += 4 * Math.cos(NodeValue);
            }
        }
        double AllNodesSum = (ExtremeNodesSum + evenNode + oddNode);
        return (step / 3) * AllNodesSum;
    }
    double cosRungeErr(double top, double bottom, double accuracy, int parts)
    {
        cosFunc(top, bottom, parts * 2);
        double functionDesicion = cosFunc(top, bottom, parts);
        double rungeError = cosFunc(top, bottom, parts * 2);
        int multiplier = 4;
        if ((rungeError - functionDesicion) > accuracy)
        {
            while ((rungeError - functionDesicion) > accuracy)
            {
                rungeError = cosFunc(top, bottom, parts * multiplier);
                multiplier *= 2;
                break;
            }
        }
        return rungeError - functionDesicion;
    }

    double powerXFunc(double top, double bottom, int parts)
    {
        double step = (top - bottom) / parts;
        double evenNode = 0;
        double oddNode = 0;
        double ExtremeNodesSum;
        double NodeValue = bottom;
        ExtremeNodesSum = Math.pow(top, 2) + Math.pow(bottom, 2);
        for (int stepNum = 1; stepNum < parts; stepNum++)
        {
            NodeValue += step;
            if (stepNum % 2 == 0)
            {
                evenNode += Math.pow(NodeValue, 2);
            }
            if (stepNum % 2 != 0)
            {
                oddNode += Math.pow(NodeValue, 2);
            }
        }
        double AllNodesSum = (ExtremeNodesSum + 2 * evenNode + 4 * oddNode);
        return (step / 3) * AllNodesSum;
    }

    double powerXRungeErr(double top, double bottom, double accuracy, int parts)
    {
        powerXFunc(top, bottom, parts * 2);
        double functionDesicion = powerXFunc(top, bottom, parts);
        double rungeError = powerXFunc(top, bottom, parts * 2);
        int multiplier = 4;
        if ((rungeError - functionDesicion) > accuracy)
        {
            if ((rungeError - functionDesicion) > accuracy)
            {
                do
                {
                    rungeError = powerXFunc(top, bottom, parts * multiplier);
                    multiplier *= 2;
                    break;
                } while ((rungeError - functionDesicion) > accuracy);
            }
        }
        return rungeError - functionDesicion;
    }

}
