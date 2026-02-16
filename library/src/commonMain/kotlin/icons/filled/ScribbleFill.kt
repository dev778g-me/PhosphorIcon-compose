package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ScribbleFill: ImageVector
    get() {
        if (_ScribbleFill != null) {
            return _ScribbleFill!!
        }
        _ScribbleFill = ImageVector.Builder(
            name = "Filled.ScribbleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(193.66f, 169.66f)
                lineToRelative(-8f, 8f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.68f)
                lineToRelative(4f, 4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineToRelative(-4f, -4f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -35.32f)
                lineToRelative(8f, -8f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.68f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.68f, 0f)
                lineToRelative(-48f, 48f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35.32f, -35.32f)
                lineToRelative(72f, -72f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.68f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.68f, 0f)
                lineToRelative(-48f, 48f)
                arcTo(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.34f, 86.34f)
                lineToRelative(28f, -28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineToRelative(-28f, 28f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.68f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.68f, 0f)
                lineToRelative(48f, -48f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.32f, 35.32f)
                lineToRelative(-72f, 72f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.68f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.68f, 0f)
                lineToRelative(48f, -48f)
                arcToRelative(25f, 25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.32f, 35.32f)
                close()
            }
        }.build()

        return _ScribbleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleFill: ImageVector? = null
