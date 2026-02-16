package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HoodieFill: ImageVector
    get() {
        if (_HoodieFill != null) {
            return _HoodieFill!!
        }
        _HoodieFill = ImageVector.Builder(
            name = "Filled.HoodieFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.31f, 120.53f)
                lineTo(183f, 39.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 169.73f, 32f)
                lineTo(86.27f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 73f, 39.12f)
                lineTo(18.69f, 120.53f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.13f, 13.09f)
                lineTo(38f, 212.21f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 53.43f, 224f)
                lineTo(80f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(96f, 192f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(16f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(26.57f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 218f, 212.21f)
                lineToRelative(21.44f, -78.59f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.31f, 120.53f)
                close()
                moveTo(80f, 208f)
                lineTo(53.43f, 208f)
                lineTo(32f, 129.41f)
                lineToRelative(32f, -48f)
                lineTo(64f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                close()
                moveTo(120f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(104f, 97.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(152f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(136f, 97.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(128f, 78.71f)
                lineTo(83.35f, 52.39f)
                lineTo(86.27f, 48f)
                horizontalLineToRelative(83.46f)
                lineToRelative(2.92f, 4.39f)
                close()
                moveTo(202.57f, 208f)
                lineTo(176f, 208f)
                lineTo(176f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(192f, 81.41f)
                lineToRelative(32f, 48f)
                close()
            }
        }.build()

        return _HoodieFill!!
    }

@Suppress("ObjectPropertyName")
private var _HoodieFill: ImageVector? = null
