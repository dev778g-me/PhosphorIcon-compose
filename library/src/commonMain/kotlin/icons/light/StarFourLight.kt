package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.StarFourLight: ImageVector
    get() {
        if (_StarFourLight != null) {
            return _StarFourLight!!
        }
        _StarFourLight = ImageVector.Builder(
            name = "Light.StarFourLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(159.82f, 159.82f)
                lineToRelative(-24.34f, 66.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15f, 0f)
                lineTo(96.18f, 159.82f)
                lineTo(29.24f, 135.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -15f)
                lineTo(96.18f, 96.18f)
                lineToRelative(24.34f, -66.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 0f)
                lineToRelative(24.34f, 66.94f)
                lineToRelative(66.94f, 24.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 15f)
                close()
            }
        }.build()

        return _StarFourLight!!
    }

@Suppress("ObjectPropertyName")
private var _StarFourLight: ImageVector? = null
