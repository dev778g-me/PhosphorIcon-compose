package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ForkKnifeFill: ImageVector
    get() {
        if (_ForkKnifeFill != null) {
            return _ForkKnifeFill!!
        }
        _ForkKnifeFill = ImageVector.Builder(
            name = "Filled.ForkKnifeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                lineTo(216f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(200f, 176f)
                lineTo(152f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                arcToRelative(268.75f, 268.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.22f, -56.88f)
                curveToRelative(9.78f, -40.49f, 28.32f, -67.63f, 53.63f, -78.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 40f)
                close()
                moveTo(119.89f, 38.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -15.78f, 2.63f)
                lineTo(111.89f, 88f)
                lineTo(88f, 88f)
                lineTo(88f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(72f, 88f)
                lineTo(48.11f, 88f)
                lineToRelative(7.78f, -46.68f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -15.78f, -2.63f)
                lineToRelative(-8f, 48f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 88f)
                arcToRelative(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 47.32f)
                lineTo(72f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(88f, 135.32f)
                arcTo(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 88f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.11f, -1.31f)
                close()
            }
        }.build()

        return _ForkKnifeFill!!
    }

@Suppress("ObjectPropertyName")
private var _ForkKnifeFill: ImageVector? = null
