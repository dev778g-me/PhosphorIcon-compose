package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WheelchairMotionFill: ImageVector
    get() {
        if (_WheelchairMotionFill != null) {
            return _WheelchairMotionFill!!
        }
        _WheelchairMotionFill = ImageVector.Builder(
            name = "Filled.WheelchairMotionFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 48f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 48f)
                close()
                moveTo(160f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 160f)
                close()
                moveTo(200f, 128f)
                lineTo(141.82f, 128f)
                lineToRelative(17.12f, -29.78f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.57f, -10.69f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 42.91f, 94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.18f, 12.33f)
                arcToRelative(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, -9.17f)
                lineTo(121.06f, 132f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 144f)
                horizontalLineToRelative(62.24f)
                lineToRelative(-14.08f, 70.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.27f, 9.41f)
                arcTo(7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.83f, -6.43f)
                lineToRelative(16f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 128f)
                close()
            }
        }.build()

        return _WheelchairMotionFill!!
    }

@Suppress("ObjectPropertyName")
private var _WheelchairMotionFill: ImageVector? = null
