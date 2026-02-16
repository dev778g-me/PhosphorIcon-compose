package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.ListStarThin: ImageVector
    get() {
        if (_ListStarThin != null) {
            return _ListStarThin!!
        }
        _ListStarThin = ImageVector.Builder(
            name = "Thin.ListStarThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 64f)
                lineTo(216f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 128f)
                lineTo(96f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 192f)
                lineTo(112f, 192f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 174.54f)
                lineToRelative(29.67f, 17.46f)
                lineToRelative(-8.07f, -32.59f)
                lineToRelative(26.4f, -21.8f)
                lineToRelative(-34.65f, -2.67f)
                lineToRelative(-13.35f, -30.94f)
                lineToRelative(-13.35f, 30.94f)
                lineToRelative(-34.65f, 2.67f)
                lineToRelative(26.4f, 21.8f)
                lineToRelative(-8.07f, 32.59f)
                lineToRelative(29.67f, -17.46f)
                close()
            }
        }.build()

        return _ListStarThin!!
    }

@Suppress("ObjectPropertyName")
private var _ListStarThin: ImageVector? = null
