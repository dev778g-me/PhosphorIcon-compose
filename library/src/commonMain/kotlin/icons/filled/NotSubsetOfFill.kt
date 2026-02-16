package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.NotSubsetOfFill: ImageVector
    get() {
        if (_NotSubsetOfFill != null) {
            return _NotSubsetOfFill!!
        }
        _NotSubsetOfFill = ImageVector.Builder(
            name = "Filled.NotSubsetOfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 80f)
                horizontalLineToRelative(31.37f)
                lineTo(90.83f, 158.33f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 80f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(189.27f, 58f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.29f, 0.75f)
                lineTo(173.37f, 64f)
                lineTo(128f, 64f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.19f, 170.49f)
                lineTo(66f, 186.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.54f)
                lineTo(92.22f, 181f)
                arcTo(63.62f, 63.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 192f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(128f, 176f)
                arcToRelative(47.63f, 47.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.13f, -7.13f)
                lineTo(190f, 69.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 189.27f, 58f)
                close()
            }
        }.build()

        return _NotSubsetOfFill!!
    }

@Suppress("ObjectPropertyName")
private var _NotSubsetOfFill: ImageVector? = null
