package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ApertureFill: ImageVector
    get() {
        if (_ApertureFill != null) {
            return _ApertureFill!!
        }
        _ApertureFill = ImageVector.Builder(
            name = "Filled.ApertureFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.46f, 54.46f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 232f)
                horizontalLineToRelative(0.09f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 128f)
                close()
                moveTo(49.18f, 88.92f)
                lineToRelative(51.21f, 9.35f)
                lineTo(46.65f, 161.53f)
                arcTo(88.39f, 88.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 49.18f, 88.92f)
                close()
                moveTo(209.35f, 94.46f)
                arcToRelative(88.41f, 88.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.53f, 72.62f)
                lineToRelative(-51.21f, -9.35f)
                close()
                moveTo(201.27f, 79.26f)
                lineTo(167.55f, 119f)
                lineTo(139.63f, 40.78f)
                arcToRelative(87.38f, 87.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 50.6f, 25f)
                arcTo(88.74f, 88.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 201.27f, 79.26f)
                close()
                moveTo(122.43f, 40.19f)
                lineToRelative(17.51f, 49f)
                lineTo(58.3f, 74.32f)
                arcToRelative(89.28f, 89.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.55f)
                arcTo(87.37f, 87.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 122.43f, 40.19f)
                close()
                moveTo(54.73f, 176.74f)
                lineTo(88.45f, 137f)
                lineToRelative(27.92f, 78.18f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -61.64f, -38.48f)
                close()
                moveTo(133.57f, 215.8f)
                lineTo(116.06f, 166.8f)
                lineTo(139.14f, 171f)
                horizontalLineToRelative(0f)
                lineToRelative(58.52f, 10.69f)
                arcToRelative(87.5f, 87.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64.13f, 34.12f)
                close()
            }
        }.build()

        return _ApertureFill!!
    }

@Suppress("ObjectPropertyName")
private var _ApertureFill: ImageVector? = null
