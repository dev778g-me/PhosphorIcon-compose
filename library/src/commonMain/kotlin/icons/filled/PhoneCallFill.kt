package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PhoneCallFill: ImageVector
    get() {
        if (_PhoneCallFill != null) {
            return _PhoneCallFill!!
        }
        _PhoneCallFill = ImageVector.Builder(
            name = "Filled.PhoneCallFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144.27f, 45.93f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.8f, -5.66f)
                arcToRelative(86.22f, 86.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.66f, 61.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, 9.8f)
                arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.73f, -5.93f)
                arcToRelative(70.35f, 70.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -50.33f, -50.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144.27f, 45.93f)
                close()
                moveTo(141.94f, 87.73f)
                curveToRelative(13.79f, 3.68f, 22.65f, 12.55f, 26.33f, 26.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 120f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.07f, -0.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -9.8f)
                curveToRelative(-5.12f, -19.16f, -18.5f, -32.54f, -37.66f, -37.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.13f, 15.46f)
                close()
                moveTo(214.37f, 166.46f)
                lineTo(167.26f, 145.35f)
                lineTo(167.13f, 145.29f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.17f, 1.4f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.56f)
                lineTo(126.87f, 168f)
                curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f)
                lineToRelative(20.78f, -24.71f)
                curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.32f, -15.06f)
                lineToRelative(0f, -0.12f)
                lineTo(89.54f, 41.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16.62f, -9.52f)
                arcTo(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 88f)
                curveToRelative(0f, 79.4f, 64.6f, 144f, 144f, 144f)
                arcToRelative(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.88f, -48.92f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 214.37f, 166.46f)
                close()
            }
        }.build()

        return _PhoneCallFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneCallFill: ImageVector? = null
