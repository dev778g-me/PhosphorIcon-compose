package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ShuffleAngularBold: ImageVector
    get() {
        if (_ShuffleAngularBold != null) {
            return _ShuffleAngularBold!!
        }
        _ShuffleAngularBold = ImageVector.Builder(
            name = "Bold.ShuffleAngularBold",
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
                moveTo(32f, 72f)
                lineToRelative(56f, 0f)
                lineToRelative(80f, 112f)
                lineToRelative(64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 48f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 160f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 184f)
                lineToRelative(56f, 0f)
                lineToRelative(15.42f, -21.59f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152.58f, 93.59f)
                lineToRelative(15.42f, -21.59f)
                lineToRelative(64f, 0f)
            }
        }.build()

        return _ShuffleAngularBold!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleAngularBold: ImageVector? = null
