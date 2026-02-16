package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LassoFill: ImageVector
    get() {
        if (_LassoFill != null) {
            return _LassoFill!!
        }
        _LassoFill = ImageVector.Builder(
            name = "Filled.LassoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(93.43f, 136.11f)
                arcToRelative(17.14f, 17.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.35f, 6.1f)
                curveToRelative(9.31f, 6.56f, 22.51f, 11.33f, 37.43f, 13.07f)
                curveTo(110.41f, 143.33f, 101.72f, 137f, 93.43f, 136.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(127.65f, 224f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.23f, -6.34f)
                curveToRelative(7.5f, -10.23f, 11.58f, -23.24f, 11.58f, -37.84f)
                curveToRelative(0f, -2.79f, -0.13f, -5.46f, -0.35f, -8.05f)
                curveTo(176.79f, 169.33f, 208f, 147.47f, 208f, 120f)
                curveToRelative(0f, -29.15f, -35.14f, -52f, -80f, -52f)
                reflectiveCurveTo(48f, 90.84f, 48f, 120f)
                curveToRelative(0f, 27.31f, 30.82f, 49.07f, 71.58f, 51.73f)
                arcToRelative(77f, 77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.42f, 8.09f)
                curveToRelative(0f, 17.62f, -7.65f, 31.95f, -21f, 39.32f)
                arcTo(38.77f, 38.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 79.27f, 224f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(192f, 120f)
                curveToRelative(0f, -19.51f, -29.31f, -36f, -64f, -36f)
                reflectiveCurveToRelative(-64f, 16.48f, -64f, 36f)
                arcToRelative(21.29f, 21.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.63f)
                arcTo(33.65f, 33.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.16f, 120.2f)
                curveToRelative(15f, 1.63f, 30.84f, 13.4f, 37.54f, 35.68f)
                curveTo(165.3f, 154.47f, 192f, 138.62f, 192f, 120f)
                close()
            }
        }.build()

        return _LassoFill!!
    }

@Suppress("ObjectPropertyName")
private var _LassoFill: ImageVector? = null
