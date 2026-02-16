package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.ArrowElbowLeftDownThin: ImageVector
    get() {
        if (_ArrowElbowLeftDownThin != null) {
            return _ArrowElbowLeftDownThin!!
        }
        _ArrowElbowLeftDownThin = ImageVector.Builder(
            name = "Thin.ArrowElbowLeftDownThin",
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
                moveTo(136f, 168f)
                lineToRelative(-48f, 48f)
                lineToRelative(-48f, -48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 72f)
                lineToRelative(-144f, 0f)
                lineToRelative(0f, 144f)
            }
        }.build()

        return _ArrowElbowLeftDownThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftDownThin: ImageVector? = null
