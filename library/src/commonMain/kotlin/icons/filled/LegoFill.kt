package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LegoFill: ImageVector
    get() {
        if (_LegoFill != null) {
            return _LegoFill!!
        }
        _LegoFill = ImageVector.Builder(
            name = "Filled.LegoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.94f, 79.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.36f, -6.37f)
                lineTo(197.29f, 49.7f)
                curveTo(191.54f, 39.24f, 177.21f, 32f, 160f, 32f)
                curveToRelative(-22.43f, 0f, -40f, 12.3f, -40f, 28f)
                arcToRelative(20.77f, 20.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 6.53f)
                lineToRelative(-19.52f, 9.76f)
                arcTo(53.69f, 53.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 72f)
                curveToRelative(-22.43f, 0f, -40f, 12.3f, -40f, 28f)
                arcToRelative(20.77f, 20.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 6.53f)
                lineTo(12.42f, 120.84f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 128f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.42f, 7.16f)
                lineToRelative(64f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 0f)
                lineToRelative(160f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 144f)
                verticalLineTo(80f)
                arcTo(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.94f, 79.21f)
                close()
                moveTo(80f, 151.06f)
                lineTo(33.89f, 128f)
                lineTo(51f, 119.45f)
                curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29f, 8.55f)
                curveToRelative(22.43f, 0f, 40f, -12.3f, 40f, -28f)
                arcToRelative(21.77f, 21.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.35f, -12.88f)
                lineTo(131f, 79.45f)
                curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29f, 8.55f)
                curveToRelative(18.38f, 0f, 33.49f, -8.26f, 38.35f, -19.88f)
                lineTo(222.11f, 80f)
                close()
                moveTo(160f, 48f)
                curveToRelative(12.23f, 0f, 21.69f, 5f, 23.63f, 10.12f)
                curveToRelative(0f, 0.09f, 0.07f, 0.18f, 0.11f, 0.28f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 60f)
                curveToRelative(0f, 5.66f, -10.26f, 12f, -24f, 12f)
                curveToRelative(-9.66f, 0f, -17.6f, -3.14f, -21.46f, -7f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.86f, -0.93f)
                arcTo(6.66f, 6.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 60f)
                curveTo(136f, 54.34f, 146.26f, 48f, 160f, 48f)
                close()
                moveTo(80f, 88f)
                arcToRelative(37f, 37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.13f, 3.87f)
                arcToRelative(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 0.56f)
                curveToRelative(3.69f, 2.21f, 5.87f, 5f, 5.87f, 7.57f)
                curveToRelative(0f, 5.66f, -10.26f, 12f, -24f, 12f)
                curveToRelative(-9.67f, 0f, -17.61f, -3.14f, -21.47f, -7f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.84f, -0.93f)
                arcTo(6.62f, 6.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 100f)
                curveTo(56f, 94.34f, 66.26f, 88f, 80f, 88f)
                close()
                moveTo(24f, 140.94f)
                lineToRelative(48f, 24f)
                verticalLineToRelative(46.12f)
                lineToRelative(-48f, -24f)
                close()
            }
        }.build()

        return _LegoFill!!
    }

@Suppress("ObjectPropertyName")
private var _LegoFill: ImageVector? = null
