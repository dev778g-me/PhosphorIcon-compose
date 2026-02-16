package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.RadioactiveFill: ImageVector
    get() {
        if (_RadioactiveFill != null) {
            return _RadioactiveFill!!
        }
        _RadioactiveFill = ImageVector.Builder(
            name = "Filled.RadioactiveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(116f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 128f)
                close()
                moveTo(100.22f, 131.51f)
                arcTo(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 128f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.94f, -25.73f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.87f, -5.66f)
                lineTo(90.75f, 48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.1f, -5.07f)
                arcToRelative(103.83f, 103.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -43.58f, 75.49f)
                arcToRelative(16.21f, 16.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.17f, 12.37f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 136f)
                lineTo(96.26f, 136f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100.22f, 131.51f)
                close()
                moveTo(231.93f, 118.42f)
                arcToRelative(103.83f, 103.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -43.58f, -75.49f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 165.25f, 48f)
                lineTo(137.19f, 96.61f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.87f, 5.66f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 128f)
                arcToRelative(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, 3.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.49f)
                lineTo(216f, 136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.76f, -5.21f)
                arcTo(16.21f, 16.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.93f, 118.42f)
                close()
                moveTo(150.8f, 151.48f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.91f, -1.15f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -33.78f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.91f, 1.15f)
                lineTo(77.25f, 199.91f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 22.52f)
                arcToRelative(104.24f, 104.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87.26f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, -22.52f)
                close()
            }
        }.build()

        return _RadioactiveFill!!
    }

@Suppress("ObjectPropertyName")
private var _RadioactiveFill: ImageVector? = null
