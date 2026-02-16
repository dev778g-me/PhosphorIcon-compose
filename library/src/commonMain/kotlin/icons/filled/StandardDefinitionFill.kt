package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StandardDefinitionFill: ImageVector
    get() {
        if (_StandardDefinitionFill != null) {
            return _StandardDefinitionFill!!
        }
        _StandardDefinitionFill = ImageVector.Builder(
            name = "Filled.StandardDefinitionFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 128f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                horizontalLineToRelative(-8f)
                lineTo(152f, 96f)
                horizontalLineToRelative(8f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 128f)
                close()
                moveTo(232f, 56f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(120f, 148f)
                curveToRelative(0f, -19.88f, -19.92f, -25.35f, -34.47f, -29.34f)
                curveToRelative(-12.06f, -3.31f, -20f, -5.84f, -20f, -10.66f)
                curveToRelative(0f, -6.73f, 8.1f, -12f, 18.44f, -12f)
                curveToRelative(8f, 0f, 14.85f, 3.13f, 17.42f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.13f, -7.51f)
                curveTo(110.16f, 86.31f, 98.07f, 80f, 84f, 80f)
                curveToRelative(-19.64f, 0f, -34.44f, 12f, -34.44f, 28f)
                curveToRelative(0f, 17.38f, 17.6f, 22.21f, 31.74f, 26.09f)
                curveToRelative(16f, 4.39f, 22.7f, 7.3f, 22.7f, 13.91f)
                curveToRelative(0f, 5.68f, -8.21f, 12f, -20f, 12f)
                reflectiveCurveToRelative(-20f, -6.32f, -20f, -12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                curveToRelative(0f, 15.7f, 15.81f, 28f, 36f, 28f)
                reflectiveCurveTo(120f, 163.7f, 120f, 148f)
                close()
                moveTo(208f, 128f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
                lineTo(144f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(16f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 128f)
                close()
            }
        }.build()

        return _StandardDefinitionFill!!
    }

@Suppress("ObjectPropertyName")
private var _StandardDefinitionFill: ImageVector? = null
