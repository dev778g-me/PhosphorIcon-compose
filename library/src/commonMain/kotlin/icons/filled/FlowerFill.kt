package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FlowerFill: ImageVector
    get() {
        if (_FlowerFill != null) {
            return _FlowerFill!!
        }
        _FlowerFill = ImageVector.Builder(
            name = "Filled.FlowerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(210.35f, 129.36f)
                curveToRelative(-0.81f, -0.47f, -1.7f, -0.92f, -2.62f, -1.36f)
                curveToRelative(0.92f, -0.44f, 1.81f, -0.89f, 2.62f, -1.36f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -40f, -69.28f)
                curveToRelative(-0.81f, 0.47f, -1.65f, 1f, -2.48f, 1.59f)
                curveToRelative(0.08f, -1f, 0.13f, -2f, 0.13f, -3f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 0f)
                curveToRelative(0f, 0.94f, 0f, 1.94f, 0.13f, 3f)
                curveToRelative(-0.83f, -0.57f, -1.67f, -1.12f, -2.48f, -1.59f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -40f, 69.28f)
                curveToRelative(0.81f, 0.47f, 1.7f, 0.92f, 2.62f, 1.36f)
                curveToRelative(-0.92f, 0.44f, -1.81f, 0.89f, -2.62f, 1.36f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 40f, 69.28f)
                curveToRelative(0.81f, -0.47f, 1.65f, -1f, 2.48f, -1.59f)
                curveToRelative(-0.08f, 1f, -0.13f, 2f, -0.13f, 2.95f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 0f)
                curveToRelative(0f, -0.94f, -0.05f, -1.94f, -0.13f, -2.95f)
                curveToRelative(0.83f, 0.57f, 1.67f, 1.12f, 2.48f, 1.59f)
                arcTo(39.79f, 39.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 190.29f, 204f)
                arcToRelative(40.43f, 40.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.42f, -1.38f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.64f, -73.28f)
                close()
                moveTo(128f, 156f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, -28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 156f)
                close()
            }
        }.build()

        return _FlowerFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerFill: ImageVector? = null
