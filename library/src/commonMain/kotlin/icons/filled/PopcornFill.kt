package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PopcornFill: ImageVector
    get() {
        if (_PopcornFill != null) {
            return _PopcornFill!!
        }
        _PopcornFill = ImageVector.Builder(
            name = "Filled.PopcornFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(229.52f, 74.21f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.13f, -2f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 41.67f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 0f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -54.4f, 30.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.4f, 9.65f)
                lineTo(54.76f, 211.67f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 70.34f, 224f)
                horizontalLineTo(185.66f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.58f, -12.33f)
                lineTo(231.79f, 81.83f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.52f, 74.21f)
                close()
                moveTo(70.34f, 208f)
                lineTo(42.91f, 91.44f)
                lineToRelative(37.85f, 10.81f)
                lineTo(94.86f, 208f)
                close()
                moveTo(122.06f, 73.76f)
                lineTo(87.57f, 87.56f)
                lineTo(49f, 76.54f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.1f, -17.28f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.56f, -5.34f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54.66f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.56f, 5.34f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207f, 76.54f)
                lineToRelative(-38.56f, 11f)
                lineToRelative(-34.49f, -13.8f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 122.06f, 73.76f)
                close()
                moveTo(185.66f, 208f)
                horizontalLineTo(161.14f)
                lineToRelative(14.1f, -105.75f)
                lineToRelative(37.85f, -10.81f)
                close()
            }
        }.build()

        return _PopcornFill!!
    }

@Suppress("ObjectPropertyName")
private var _PopcornFill: ImageVector? = null
