package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LecternFill: ImageVector
    get() {
        if (_LecternFill != null) {
            return _LecternFill!!
        }
        _LecternFill = ImageVector.Builder(
            name = "Filled.LecternFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(246.3f, 120.84f)
                lineToRelative(-40f, -80f)
                arcTo(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 32f)
                horizontalLineTo(64f)
                arcTo(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 49.7f, 40.84f)
                lineToRelative(-40f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 144f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(64f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(136f)
                verticalLineTo(144f)
                horizontalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.31f, -23.16f)
                close()
                moveTo(192f, 120f)
                horizontalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _LecternFill!!
    }

@Suppress("ObjectPropertyName")
private var _LecternFill: ImageVector? = null
