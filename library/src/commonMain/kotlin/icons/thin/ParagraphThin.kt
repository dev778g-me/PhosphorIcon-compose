package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.ParagraphThin: ImageVector
    get() {
        if (_ParagraphThin != null) {
            return _ParagraphThin!!
        }
        _ParagraphThin = ImageVector.Builder(
            name = "Thin.ParagraphThin",
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
                moveTo(184f, 48f)
                lineTo(184f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 48f)
                lineTo(144f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 160f)
                horizontalLineTo(96f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 48f)
                horizontalLineTo(208f)
            }
        }.build()

        return _ParagraphThin!!
    }

@Suppress("ObjectPropertyName")
private var _ParagraphThin: ImageVector? = null
