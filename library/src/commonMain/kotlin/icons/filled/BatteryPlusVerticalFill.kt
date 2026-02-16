package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BatteryPlusVerticalFill: ImageVector
    get() {
        if (_BatteryPlusVerticalFill != null) {
            return _BatteryPlusVerticalFill!!
        }
        _BatteryPlusVerticalFill = ImageVector.Builder(
            name = "Filled.BatteryPlusVerticalFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(96f, 16f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 8f)
                close()
                moveTo(200f, 56f)
                lineTo(200f, 224f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                lineTo(80f, 248f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                lineTo(56f, 56f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 32f)
                horizontalLineToRelative(96f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 56f)
                close()
                moveTo(164f, 140f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(136f, 132f)
                lineTo(136f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(20f)
                lineTo(100f, 132f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 148f)
                horizontalLineToRelative(20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164f, 140f)
                close()
            }
        }.build()

        return _BatteryPlusVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryPlusVerticalFill: ImageVector? = null
