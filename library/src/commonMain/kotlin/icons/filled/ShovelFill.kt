package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShovelFill: ImageVector
    get() {
        if (_ShovelFill != null) {
            return _ShovelFill!!
        }
        _ShovelFill = ImageVector.Builder(
            name = "Filled.ShovelFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.66f, 69.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineTo(216f, 51.31f)
                lineToRelative(-71f, 71f)
                lineTo(133.66f, 111f)
                lineToRelative(71f, -71f)
                lineTo(186.34f, 21.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(48f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 245.66f, 69.66f)
                close()
                moveTo(88f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                lineTo(133.66f, 111f)
                lineTo(99.31f, 76.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
                lineToRelative(-56f, 56f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 144f)
                verticalLineToRelative(80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(80f)
                arcToRelative(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, -4.69f)
                lineToRelative(56f, -56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.62f)
                lineTo(145f, 122.34f)
                lineTo(93.66f, 173.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 176f)
                close()
            }
        }.build()

        return _ShovelFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShovelFill: ImageVector? = null
