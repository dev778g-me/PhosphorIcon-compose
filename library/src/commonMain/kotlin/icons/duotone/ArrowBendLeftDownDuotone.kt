package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ArrowBendLeftDownDuotone: ImageVector
    get() {
        if (_ArrowBendLeftDownDuotone != null) {
            return _ArrowBendLeftDownDuotone!!
        }
        _ArrowBendLeftDownDuotone = ImageVector.Builder(
            name = "Duotone.ArrowBendLeftDownDuotone",
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
                moveTo(152f, 176f)
                lineToRelative(-48f, 48f)
                lineToRelative(-48f, -48f)
                lineToRelative(96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 176f)
                lineToRelative(-48f, 48f)
                lineToRelative(-48f, -48f)
                lineToRelative(96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 96f)
                verticalLineToRelative(48f)
            }
        }.build()

        return _ArrowBendLeftDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendLeftDownDuotone: ImageVector? = null
