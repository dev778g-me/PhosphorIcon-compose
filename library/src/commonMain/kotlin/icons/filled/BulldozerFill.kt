package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BulldozerFill: ImageVector
    get() {
        if (_BulldozerFill != null) {
            return _BulldozerFill!!
        }
        _BulldozerFill = ImageVector.Builder(
            name = "Filled.BulldozerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 200f)
                horizontalLineToRelative(-8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineToRelative(-8f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
                verticalLineToRelative(8f)
                horizontalLineTo(199.2f)
                arcToRelative(40.1f, 40.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.71f, -31.61f)
                lineTo(129.44f, 49.85f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 114.67f, 40f)
                horizontalLineTo(24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 56f)
                verticalLineToRelative(96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 64f)
                horizontalLineTo(160f)
                arcToRelative(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 39.2f, -32f)
                horizontalLineTo(216f)
                verticalLineToRelative(8f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(64f, 56f)
                horizontalLineToRelative(50.67f)
                lineTo(148f, 136f)
                horizontalLineTo(64f)
                close()
                moveTo(24f, 56f)
                horizontalLineTo(48f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                arcToRelative(39.72f, 39.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 3.35f)
                close()
                moveTo(160f, 184f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _BulldozerFill!!
    }

@Suppress("ObjectPropertyName")
private var _BulldozerFill: ImageVector? = null
