package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.HandbagLight: ImageVector
    get() {
        if (_HandbagLight != null) {
            return _HandbagLight!!
        }
        _HandbagLight = ImageVector.Builder(
            name = "Light.HandbagLight",
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
                moveTo(209.67f, 72f)
                horizontalLineTo(46.33f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 7.07f)
                lineToRelative(-14.25f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.93f)
                horizontalLineTo(223.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.93f)
                lineToRelative(-14.25f, -120f)
                arcTo(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 209.67f, 72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 104f)
                verticalLineTo(64f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 0f)
                verticalLineToRelative(40f)
            }
        }.build()

        return _HandbagLight!!
    }

@Suppress("ObjectPropertyName")
private var _HandbagLight: ImageVector? = null
