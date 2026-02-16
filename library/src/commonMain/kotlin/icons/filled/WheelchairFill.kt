package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WheelchairFill: ImageVector
    get() {
        if (_WheelchairFill != null) {
            return _WheelchairFill!!
        }
        _WheelchairFill = ImageVector.Builder(
            name = "Filled.WheelchairFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(250.53f, 199.59f)
                lineToRelative(-24f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.69f, -4f)
                lineTo(187.05f, 144f)
                horizontalLineTo(104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(106.34f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 216f)
                curveToRelative(25.91f, 0f, 50.09f, -18.05f, 56.25f, -42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.5f, 4f)
                curveToRelative(-8.06f, 31.3f, -38.23f, 54f, -71.75f, 54f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 89.81f)
                verticalLineToRelative(-19f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                verticalLineTo(88f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(112f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.15f, 4.42f)
                lineToRelative(28.9f, 57.8f)
                lineToRelative(17.42f, -5.81f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.06f, 15.18f)
                close()
            }
        }.build()

        return _WheelchairFill!!
    }

@Suppress("ObjectPropertyName")
private var _WheelchairFill: ImageVector? = null
