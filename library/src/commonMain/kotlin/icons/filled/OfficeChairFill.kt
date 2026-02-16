package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.OfficeChairFill: ImageVector
    get() {
        if (_OfficeChairFill != null) {
            return _OfficeChairFill!!
        }
        _OfficeChairFill = ImageVector.Builder(
            name = "Filled.OfficeChairFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(223.33f)
                arcTo(48.08f, 48.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 176f)
                horizontalLineTo(136f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(24f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(136f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(216f)
                horizontalLineTo(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                horizontalLineToRelative(24f)
                verticalLineTo(176f)
                horizontalLineTo(80f)
                arcToRelative(48.08f, 48.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -47.33f, -40f)
                horizontalLineTo(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
                horizontalLineToRelative(96f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 128f)
                close()
                moveTo(80f, 144f)
                horizontalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.84f, -18.26f)
                lineToRelative(-13.72f, -96f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 162.28f, 16f)
                horizontalLineTo(93.72f)
                arcTo(16.08f, 16.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 77.88f, 29.74f)
                lineToRelative(-13.72f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 144f)
                close()
            }
        }.build()

        return _OfficeChairFill!!
    }

@Suppress("ObjectPropertyName")
private var _OfficeChairFill: ImageVector? = null
