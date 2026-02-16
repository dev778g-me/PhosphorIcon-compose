package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TShirtFill: ImageVector
    get() {
        if (_TShirtFill != null) {
            return _TShirtFill!!
        }
        _TShirtFill = ImageVector.Builder(
            name = "Filled.TShirtFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.59f, 61.22f)
                lineTo(195.83f, 33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 32f)
                lineTo(160f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(64f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.84f, 1f)
                lineTo(8.41f, 61.22f)
                arcTo(15.76f, 15.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.82f, 82.48f)
                lineToRelative(19.27f, 36.81f)
                arcTo(16.37f, 16.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.67f, 128f)
                lineTo(56f, 128f)
                verticalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(184f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(200f, 128f)
                horizontalLineToRelative(20.34f)
                arcToRelative(16.37f, 16.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.58f, -8.71f)
                lineToRelative(19.27f, -36.81f)
                arcTo(15.76f, 15.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.59f, 61.22f)
                close()
                moveTo(35.67f, 112f)
                arcToRelative(0.62f, 0.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, -0.13f)
                lineTo(16.09f, 75.26f)
                lineTo(56f, 53.48f)
                lineTo(56f, 112f)
                close()
                moveTo(220.74f, 111.86f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, 0.14f)
                lineTo(200f, 112f)
                lineTo(200f, 53.48f)
                lineToRelative(39.92f, 21.78f)
                close()
            }
        }.build()

        return _TShirtFill!!
    }

@Suppress("ObjectPropertyName")
private var _TShirtFill: ImageVector? = null
