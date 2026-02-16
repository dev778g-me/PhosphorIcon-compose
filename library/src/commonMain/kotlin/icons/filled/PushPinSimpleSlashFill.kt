package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PushPinSimpleSlashFill: ImageVector
    get() {
        if (_PushPinSimpleSlashFill != null) {
            return _PushPinSimpleSlashFill!!
        }
        _PushPinSimpleSlashFill = ImageVector.Builder(
            name = "Filled.PushPinSimpleSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(79.25f, 38.69f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -6.69f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 191.73f, 48f)
                horizontalLineToRelative(-6.19f)
                lineTo(206.7f, 167.91f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.9f, 3.39f)
                close()
                moveTo(213.92f, 210.62f)
                lineToRelative(-160f, -176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.08f, 45.38f)
                lineTo(66.24f, 72f)
                lineTo(49.29f, 168f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(184f)
                horizontalLineToRelative(32.1f)
                lineToRelative(34f, 37.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
            }
        }.build()

        return _PushPinSimpleSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _PushPinSimpleSlashFill: ImageVector? = null
