package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ShareDuotone: ImageVector
    get() {
        if (_ShareDuotone != null) {
            return _ShareDuotone!!
        }
        _ShareDuotone = ImageVector.Builder(
            name = "Duotone.ShareDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(176f, 152f)
                lineToRelative(48f, -48f)
                lineToRelative(-48f, -48f)
                lineToRelative(0f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 152f)
                lineToRelative(48f, -48f)
                lineToRelative(-48f, -48f)
                lineToRelative(0f, 96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 216f)
                lineToRelative(-160f, 0f)
                lineToRelative(0f, -128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 176f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 93f, -72f)
                horizontalLineToRelative(11f)
            }
        }.build()

        return _ShareDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ShareDuotone: ImageVector? = null
