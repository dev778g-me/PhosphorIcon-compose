package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.ArrowElbowUpRightThin: ImageVector
    get() {
        if (_ArrowElbowUpRightThin != null) {
            return _ArrowElbowUpRightThin!!
        }
        _ArrowElbowUpRightThin = ImageVector.Builder(
            name = "Thin.ArrowElbowUpRightThin",
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
                moveTo(168f, 128f)
                lineToRelative(48f, -48f)
                lineToRelative(-48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 224f)
                lineToRelative(0f, -144f)
                lineToRelative(144f, 0f)
            }
        }.build()

        return _ArrowElbowUpRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowUpRightThin: ImageVector? = null
