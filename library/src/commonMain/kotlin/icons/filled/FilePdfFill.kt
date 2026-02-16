package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FilePdfFill: ImageVector
    get() {
        if (_FilePdfFill != null) {
            return _FilePdfFill!!
        }
        _FilePdfFill = ImageVector.Builder(
            name = "Filled.FilePdfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(44f, 120f)
                lineTo(212f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(216f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(76f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44f, 120f)
                close()
                moveTo(152f, 44f)
                lineToRelative(44f, 44f)
                lineTo(152f, 88f)
                close()
                moveTo(224f, 152.53f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.25f, 7.47f)
                lineTo(192f, 160f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(15.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.53f)
                lineTo(192f, 192f)
                verticalLineToRelative(15.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                lineTo(176f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 152.53f)
                close()
                moveTo(64f, 144f)
                lineTo(48f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(55.73f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.47f, 216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 208f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(7.4f)
                curveToRelative(15.24f, 0f, 28.14f, -11.92f, 28.59f, -27.15f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 144f)
                close()
                moveTo(63.65f, 184f)
                lineTo(56f, 184f)
                lineTo(56f, 160f)
                horizontalLineToRelative(8f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.16f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.65f, 184f)
                close()
                moveTo(128f, 144f)
                lineTo(112f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(15.32f)
                curveToRelative(19.66f, 0f, 36.21f, -15.48f, 36.67f, -35.13f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 144f)
                close()
                moveTo(127.51f, 200f)
                lineTo(120f, 200f)
                lineTo(120f, 160f)
                horizontalLineToRelative(8f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20.77f)
                curveTo(147.58f, 191.59f, 138.34f, 200f, 127.51f, 200f)
                close()
            }
        }.build()

        return _FilePdfFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilePdfFill: ImageVector? = null
