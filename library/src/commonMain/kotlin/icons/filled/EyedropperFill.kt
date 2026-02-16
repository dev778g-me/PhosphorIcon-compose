package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.EyedropperFill: ImageVector
    get() {
        if (_EyedropperFill != null) {
            return _EyedropperFill!!
        }
        _EyedropperFill = ImageVector.Builder(
            name = "Filled.EyedropperFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 67.3f)
                arcToRelative(35.79f, 35.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.26f, -25.66f)
                curveToRelative(-14f, -13.28f, -36.72f, -12.78f, -50.62f, 1.13f)
                lineTo(138.8f, 66.2f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.14f, 0.77f)
                lineToRelative(-5f, 5f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.64f)
                lineToRelative(2f, 2.06f)
                lineToRelative(-51f, 51f)
                arcToRelative(39.75f, 39.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.53f, 38f)
                lineToRelative(-8f, 18.41f)
                arcTo(13.68f, 13.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 219.3f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.71f, 3.35f)
                lineTo(71.23f, 215f)
                arcToRelative(39.89f, 39.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.06f, -10.75f)
                lineToRelative(51f, -51f)
                lineToRelative(2.06f, 2.06f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 0f)
                lineToRelative(5f, -5f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, -33.18f)
                lineToRelative(23.75f, -23.87f)
                arcTo(35.75f, 35.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 67.3f)
                close()
                moveTo(97f, 193f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.55f, 0.31f)
                lineToRelative(-18.1f, 7.91f)
                lineTo(57f, 189.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, -5.75f)
                arcTo(23.88f, 23.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63f, 159f)
                lineToRelative(51f, -51f)
                lineToRelative(33.94f, 34f)
                close()
            }
        }.build()

        return _EyedropperFill!!
    }

@Suppress("ObjectPropertyName")
private var _EyedropperFill: ImageVector? = null
