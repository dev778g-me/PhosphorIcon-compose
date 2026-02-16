package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CrosshairFill: ImageVector
    get() {
        if (_CrosshairFill != null) {
            return _CrosshairFill!!
        }
        _CrosshairFill = ImageVector.Builder(
            name = "Filled.CrosshairFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 120f)
                horizontalLineToRelative(-8.34f)
                arcTo(96.14f, 96.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 32.34f)
                lineTo(136f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(8.34f)
                arcTo(96.14f, 96.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.34f, 120f)
                lineTo(24f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(8.34f)
                arcTo(96.14f, 96.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 223.66f)
                lineTo(120f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineToRelative(-8.34f)
                arcTo(96.14f, 96.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.66f, 136f)
                lineTo(232f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(136f, 207.6f)
                lineTo(136f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(7.6f)
                arcTo(80.15f, 80.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48.4f, 136f)
                lineTo(56f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(48.4f, 120f)
                arcTo(80.15f, 80.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 48.4f)
                lineTo(120f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(136f, 48.4f)
                arcTo(80.15f, 80.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207.6f, 120f)
                lineTo(200f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(7.6f)
                arcTo(80.15f, 80.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 207.6f)
                close()
                moveTo(168f, 128f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 128f)
                close()
            }
        }.build()

        return _CrosshairFill!!
    }

@Suppress("ObjectPropertyName")
private var _CrosshairFill: ImageVector? = null
