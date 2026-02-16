package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PlugChargingFill: ImageVector
    get() {
        if (_PlugChargingFill != null) {
            return _PlugChargingFill!!
        }
        _PlugChargingFill = ImageVector.Builder(
            name = "Filled.PlugChargingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 56f)
                lineTo(176f, 56f)
                lineTo(176f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(160f, 56f)
                lineTo(96f, 56f)
                lineTo(96f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                curveToRelative(-3.21f, 0f, -8f, 2.27f, -8f, 8.54f)
                lineTo(80f, 56f)
                lineTo(32.55f, 56f)
                curveTo(26.28f, 56f, 24f, 60.78f, 24f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(48f, 72f)
                verticalLineToRelative(88f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 200f)
                horizontalLineToRelative(32f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                lineTo(208f, 72f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(151.49f, 130.81f)
                lineTo(139.49f, 162.81f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15f, -5.62f)
                lineToRelative(8f, -21.19f)
                lineTo(112f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.49f, -10.81f)
                lineToRelative(12f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15f, 5.62f)
                lineToRelative(-8f, 21.19f)
                lineTo(144f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.49f, 10.81f)
                close()
            }
        }.build()

        return _PlugChargingFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlugChargingFill: ImageVector? = null
