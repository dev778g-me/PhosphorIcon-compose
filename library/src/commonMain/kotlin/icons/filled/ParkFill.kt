package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ParkFill: ImageVector
    get() {
        if (_ParkFill != null) {
            return _ParkFill!!
        }
        _ParkFill = ImageVector.Builder(
            name = "Filled.ParkFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 192f)
                lineTo(200f, 192f)
                lineTo(200f, 168f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, -9.94f)
                lineToRelative(-32f, -128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.52f, 0f)
                lineToRelative(-32f, 128f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 168f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                lineTo(120f, 192f)
                lineTo(120f, 176f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineToRelative(-8f)
                lineTo(120f, 144f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(40f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(16f)
                lineTo(40f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(16f)
                lineTo(24f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(232f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(104f, 192f)
                lineTo(64f, 192f)
                lineTo(64f, 176f)
                horizontalLineToRelative(40f)
                close()
                moveTo(104f, 160f)
                lineTo(64f, 160f)
                lineTo(64f, 144f)
                horizontalLineToRelative(40f)
                close()
                moveTo(116f, 96f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 88f, 68f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 116f, 96f)
                close()
                moveTo(116f, 56f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 56f)
                close()
            }
        }.build()

        return _ParkFill!!
    }

@Suppress("ObjectPropertyName")
private var _ParkFill: ImageVector? = null
