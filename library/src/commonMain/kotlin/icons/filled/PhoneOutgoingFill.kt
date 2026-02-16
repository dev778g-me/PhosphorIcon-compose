package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PhoneOutgoingFill: ImageVector
    get() {
        if (_PhoneOutgoingFill != null) {
            return _PhoneOutgoingFill!!
        }
        _PhoneOutgoingFill = ImageVector.Builder(
            name = "Filled.PhoneOutgoingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(146.34f, 109.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                lineTo(180.69f, 64f)
                lineTo(160f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                lineTo(208f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(192f, 75.31f)
                lineToRelative(-34.34f, 34.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                close()
                moveTo(214.34f, 166.46f)
                lineTo(167.23f, 145.35f)
                lineTo(167.1f, 145.29f)
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

        return _PhoneOutgoingFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneOutgoingFill: ImageVector? = null
