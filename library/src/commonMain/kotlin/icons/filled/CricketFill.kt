package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CricketFill: ImageVector
    get() {
        if (_CricketFill != null) {
            return _CricketFill!!
        }
        _CricketFill = ImageVector.Builder(
            name = "Filled.CricketFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(243.31f, 81.37f)
                lineTo(190.63f, 28.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(60.69f, 136f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.63f)
                lineToRelative(20.68f, 20.68f)
                lineToRelative(-47f, 47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineToRelative(47f, -47f)
                lineToRelative(20.68f, 20.68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 0f)
                lineTo(243.31f, 104f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -22.63f)
                close()
                moveTo(124.69f, 200f)
                lineTo(104f, 179.31f)
                lineToRelative(29.66f, -29.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(92.69f, 168f)
                lineTo(72f, 147.31f)
                lineTo(107.31f, 112f)
                horizontalLineTo(160f)
                verticalLineToRelative(52.69f)
                close()
                moveTo(32f, 60f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60f, 88f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 60f)
                close()
            }
        }.build()

        return _CricketFill!!
    }

@Suppress("ObjectPropertyName")
private var _CricketFill: ImageVector? = null
