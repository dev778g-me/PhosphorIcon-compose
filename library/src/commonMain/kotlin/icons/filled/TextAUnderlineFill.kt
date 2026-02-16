package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TextAUnderlineFill: ImageVector
    get() {
        if (_TextAUnderlineFill != null) {
            return _TextAUnderlineFill!!
        }
        _TextAUnderlineFill = ImageVector.Builder(
            name = "Filled.TextAUnderlineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(148.73f, 120f)
                horizontalLineTo(107.27f)
                lineTo(128f, 75.09f)
                close()
                moveTo(216f, 32f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 32f)
                close()
                moveTo(76.65f, 167.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.61f, -3.91f)
                lineTo(99.89f, 136f)
                horizontalLineToRelative(56.22f)
                lineToRelative(12.63f, 27.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.52f, -6.7f)
                lineToRelative(-48f, -104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.52f, 0f)
                lineToRelative(-48f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76.65f, 167.26f)
                close()
                moveTo(200f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 192f)
                close()
            }
        }.build()

        return _TextAUnderlineFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextAUnderlineFill: ImageVector? = null
