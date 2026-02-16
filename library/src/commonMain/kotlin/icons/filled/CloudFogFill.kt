package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CloudFogFill: ImageVector
    get() {
        if (_CloudFogFill != null) {
            return _CloudFogFill!!
        }
        _CloudFogFill = ImageVector.Builder(
            name = "Filled.CloudFogFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(104f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 232f)
                close()
                moveTo(128f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(72f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 200f)
                close()
                moveTo(184f, 192f)
                lineTo(160f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(231.87f, 95.55f)
                arcToRelative(76f, 76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -151.78f, 0.73f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 104f)
                lineToRelative(-0.6f, 0f)
                arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 95.39f)
                arcToRelative(92.48f, 92.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, -16.51f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -4.78f)
                arcTo(52.09f, 52.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 124.36f)
                curveTo(24.2f, 153.07f, 48.12f, 176f, 76.84f, 176f)
                lineTo(156f, 176f)
                arcTo(76.08f, 76.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.87f, 95.55f)
                close()
            }
        }.build()

        return _CloudFogFill!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFogFill: ImageVector? = null
