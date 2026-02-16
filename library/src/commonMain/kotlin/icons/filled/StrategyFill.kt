package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StrategyFill: ImageVector
    get() {
        if (_StrategyFill != null) {
            return _StrategyFill!!
        }
        _StrategyFill = ImageVector.Builder(
            name = "Filled.StrategyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(108f, 188f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 108f, 188f)
                close()
                moveTo(53.66f, 117.66f)
                lineTo(68f, 103.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                lineTo(79.31f, 92f)
                lineTo(93.66f, 77.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 82.34f, 66.34f)
                lineTo(68f, 80.69f)
                lineTo(53.66f, 66.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42.34f, 77.66f)
                lineTo(56.69f, 92f)
                lineTo(42.34f, 106.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                close()
                moveTo(215.31f, 188f)
                lineToRelative(14.35f, -14.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(204f, 176.69f)
                lineToRelative(-14.34f, -14.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineTo(192.69f, 188f)
                lineToRelative(-14.35f, 14.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineTo(204f, 199.31f)
                lineToRelative(14.34f, 14.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
                moveTo(165.66f, 50.34f)
                lineTo(163.31f, 48f)
                horizontalLineTo(184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(59.31f)
                lineToRelative(2.34f, 2.35f)
                curveToRelative(17.93f, 17.93f, 17.9f, 35.4f, 14.71f, 46.9f)
                curveToRelative(-4.64f, 16.77f, -19.36f, 31.77f, -35f, 35.68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 160f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.95f, -0.24f)
                curveToRelative(21.21f, -5.3f, 40.35f, -24.6f, 46.53f, -46.93f)
                curveTo(190.58f, 90.78f, 183.9f, 68.59f, 165.66f, 50.34f)
                close()
            }
        }.build()

        return _StrategyFill!!
    }

@Suppress("ObjectPropertyName")
private var _StrategyFill: ImageVector? = null
