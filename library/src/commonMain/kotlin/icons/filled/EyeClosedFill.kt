package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.EyeClosedFill: ImageVector
    get() {
        if (_EyeClosedFill != null) {
            return _EyeClosedFill!!
        }
        _EyeClosedFill = ImageVector.Builder(
            name = "Filled.EyeClosedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.94f, 164f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 217.05f, 172f)
                lineToRelative(-19f, -33.2f)
                arcTo(123.23f, 123.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 162f, 155.46f)
                lineToRelative(5.87f, 35.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.58f, 9.21f)
                arcTo(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.88f, -6.69f)
                lineToRelative(-5.77f, -34.58f)
                arcToRelative(133.06f, 133.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36.68f, 0f)
                lineToRelative(-5.77f, 34.58f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 200f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, -0.11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.58f, -9.21f)
                lineTo(94f, 155.46f)
                arcToRelative(123.23f, 123.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36.06f, -16.69f)
                lineTo(39f, 172f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 25.06f, 164f)
                lineToRelative(20f, -35f)
                arcToRelative(152.8f, 152.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.3f, -20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -10.06f)
                curveTo(44.56f, 75.72f, 77.55f, 48f, 128f, 48f)
                reflectiveCurveToRelative(83.44f, 27.72f, 102.22f, 51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 10.06f)
                arcToRelative(152.8f, 152.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.3f, 20f)
                close()
            }
        }.build()

        return _EyeClosedFill!!
    }

@Suppress("ObjectPropertyName")
private var _EyeClosedFill: ImageVector? = null
