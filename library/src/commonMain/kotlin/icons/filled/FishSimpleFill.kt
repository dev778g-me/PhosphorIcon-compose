package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FishSimpleFill: ImageVector
    get() {
        if (_FishSimpleFill != null) {
            return _FishSimpleFill!!
        }
        _FishSimpleFill = ImageVector.Builder(
            name = "Filled.FishSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 76f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 76f)
                close()
                moveTo(210f, 155.08f)
                curveToRelative(-15.08f, 20.84f, -37.53f, 34.88f, -66.7f, 41.74f)
                curveToRelative(-20.08f, 4.72f, -43.54f, 6f, -70.12f, 3.93f)
                quadToRelative(2.4f, 17.82f, 6.72f, 37.54f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.1f, 9.52f)
                arcToRelative(7.81f, 7.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.72f, 0.19f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.81f, -6.29f)
                quadToRelative(-4.89f, -22.36f, -7.41f, -42.62f)
                quadToRelative(-20.22f, -2.51f, -42.58f, -7.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.43f, -15.63f)
                quadToRelative(19.7f, 4.32f, 37.5f, 6.73f)
                curveToRelative(-2.09f, -26.56f, -0.78f, -50f, 3.93f, -70.06f)
                curveTo(66f, 83.55f, 80.05f, 61.1f, 100.88f, 46f)
                curveTo(115f, 35.76f, 140.14f, 23.64f, 179.27f, 24f)
                curveToRelative(21.19f, 0.21f, 40.83f, 4.33f, 43.81f, 6.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 2.83f)
                curveToRelative(1.75f, 3f, 5.87f, 22.59f, 6.08f, 43.78f)
                curveTo(232.21f, 98.31f, 228.57f, 129.44f, 210f, 155.08f)
                close()
                moveTo(212.43f, 43.56f)
                arcToRelative(175.75f, 175.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -39.22f, -3.51f)
                curveToRelative(-24.34f, 0.64f, -44.71f, 6.49f, -60.76f, 17.39f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 86.09f, 86.1f)
                curveToRelative(10.91f, -16f, 16.76f, -36.42f, 17.4f, -60.76f)
                arcTo(175.82f, 175.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212.44f, 43.56f)
                close()
            }
        }.build()

        return _FishSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _FishSimpleFill: ImageVector? = null
