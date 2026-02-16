package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SignatureFill: ImageVector
    get() {
        if (_SignatureFill != null) {
            return _SignatureFill!!
        }
        _SignatureFill = ImageVector.Builder(
            name = "Filled.SignatureFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(80.3f, 120.26f)
                arcTo(58.29f, 58.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 81f, 97.07f)
                curveTo(83.32f, 87f, 87.89f, 80f, 92.1f, 80f)
                curveToRelative(2.57f, 0f, 2.94f, 0.67f, 3.12f, 1f)
                curveToRelative(0.88f, 1.61f, 4f, 10.93f, -12.63f, 46.52f)
                arcTo(28.87f, 28.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.3f, 120.26f)
                close()
                moveTo(232f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                horizontalLineTo(216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(84f, 160f)
                curveToRelative(2f, -3.59f, 3.94f, -7.32f, 5.9f, -11.14f)
                curveToRelative(10.34f, -0.32f, 22.21f, -7.57f, 35.47f, -21.68f)
                curveToRelative(5f, 9.69f, 11.38f, 15.25f, 18.87f, 16.55f)
                curveToRelative(8f, 1.38f, 16f, -2.38f, 23.94f, -11.2f)
                curveToRelative(6f, 5.53f, 16.15f, 11.47f, 31.8f, 11.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                curveToRelative(-17.91f, 0f, -24.3f, -10.88f, -24.84f, -11.86f)
                arcToRelative(7.83f, 7.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.54f, -4.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.25f, 3.6f)
                curveToRelative(-6.78f, 10f, -11.87f, 13.16f, -14.39f, 12.73f)
                curveToRelative(-4f, -0.69f, -9.15f, -10f, -11.23f, -18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, -3f)
                curveToRelative(-8.88f, 10.94f, -16.3f, 17.79f, -22.13f, 21.66f)
                curveToRelative(15.8f, -35.65f, 13.27f, -48.59f, 9.6f, -55.3f)
                curveTo(107.35f, 69.84f, 102.59f, 64f, 92.1f, 64f)
                curveTo(79.66f, 64f, 69.68f, 75f, 65.41f, 93.46f)
                arcToRelative(75f, 75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.83f, 29.81f)
                curveToRelative(1.7f, 8.9f, 5.17f, 15.73f, 10.16f, 20.12f)
                curveToRelative(-3f, 5.81f, -6.09f, 11.43f, -9f, 16.61f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(0.44f)
                curveToRelative(-4.26f, 7.12f, -7.11f, 11.59f, -7.18f, 11.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.48f, 8.62f)
                curveToRelative(0.36f, -0.55f, 5.47f, -8.57f, 12.29f, -20.31f)
                horizontalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
            }
        }.build()

        return _SignatureFill!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureFill: ImageVector? = null
