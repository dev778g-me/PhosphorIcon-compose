package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BicycleFill: ImageVector
    get() {
        if (_BicycleFill != null) {
            return _BicycleFill!!
        }
        _BicycleFill = ImageVector.Builder(
            name = "Filled.BicycleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(54.46f, 164.71f)
                lineTo(82.33f, 126.5f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.92f, -9.44f)
                lineTo(41.54f, 155.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.92f, 9.42f)
                close()
                moveTo(208f, 112f)
                arcToRelative(47.81f, 47.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16.93f, 3.09f)
                lineTo(214.91f, 156f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 201.09f, 164f)
                lineToRelative(-23.83f, -40.86f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 208f, 112f)
                close()
                moveTo(165.93f, 72f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                horizontalLineTo(152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.91f, 12f)
                lineToRelative(11.65f, 20f)
                horizontalLineTo(99.26f)
                lineTo(82.91f, 60f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76f, 56f)
                horizontalLineTo(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineTo(71.41f)
                lineTo(85.12f, 95.51f)
                lineTo(69.41f, 117.06f)
                arcToRelative(47.87f, 47.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.92f, 9.44f)
                lineToRelative(11.59f, -15.9f)
                lineTo(125.09f, 164f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 138.91f, 156f)
                lineToRelative(-30.32f, -52f)
                horizontalLineToRelative(57.48f)
                lineToRelative(11.19f, 19.17f)
                arcToRelative(48.11f, 48.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.81f, -8.08f)
                close()
            }
        }.build()

        return _BicycleFill!!
    }

@Suppress("ObjectPropertyName")
private var _BicycleFill: ImageVector? = null
