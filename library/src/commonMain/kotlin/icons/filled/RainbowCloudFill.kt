package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.RainbowCloudFill: ImageVector
    get() {
        if (_RainbowCloudFill != null) {
            return _RainbowCloudFill!!
        }
        _RainbowCloudFill = ImageVector.Builder(
            name = "Filled.RainbowCloudFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 160f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
                lineTo(152f, 208f)
                curveToRelative(-17.65f, 0f, -32f, -14.75f, -32f, -32.89f)
                reflectiveCurveToRelative(14.35f, -32.89f, 32f, -32.89f)
                arcToRelative(31f, 31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.34f, 0.18f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 160f)
                close()
                moveTo(112f, 72f)
                arcToRelative(87.57f, 87.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.35f, 24.91f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184.5f, 85.44f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 160f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(24f, 160f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 72f)
                close()
                moveTo(112f, 104f)
                arcToRelative(55.58f, 55.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 33.13f, 10.84f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 154.6f, 102f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 160f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(56f, 160f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 104f)
                close()
                moveTo(127.21f, 130.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.94f, -9.63f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 160f)
                verticalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(88f, 160f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.57f, -23.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 127.21f, 130.71f)
                close()
            }
        }.build()

        return _RainbowCloudFill!!
    }

@Suppress("ObjectPropertyName")
private var _RainbowCloudFill: ImageVector? = null
