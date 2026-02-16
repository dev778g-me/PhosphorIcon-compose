package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.UniteSquareBold: ImageVector
    get() {
        if (_UniteSquareBold != null) {
            return _UniteSquareBold!!
        }
        _UniteSquareBold = ImageVector.Builder(
            name = "Bold.UniteSquareBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 216f)
                lineToRelative(120f, 0f)
                lineToRelative(0f, -120f)
                lineToRelative(-56f, 0f)
                lineToRelative(0f, -56f)
                lineToRelative(-120f, 0f)
                lineToRelative(0f, 120f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 40f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 40f)
                lineTo(216f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 96f)
                lineTo(160f, 216f)
            }
        }.build()

        return _UniteSquareBold!!
    }

@Suppress("ObjectPropertyName")
private var _UniteSquareBold: ImageVector? = null
