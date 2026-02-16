package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.SigmaThin: ImageVector
    get() {
        if (_SigmaThin != null) {
            return _SigmaThin!!
        }
        _SigmaThin = ImageVector.Builder(
            name = "Thin.SigmaThin",
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
                moveTo(192f, 72f)
                lineToRelative(0f, -24f)
                lineToRelative(-128f, 0f)
                lineToRelative(64f, 80f)
                lineToRelative(-64f, 80f)
                lineToRelative(128f, 0f)
                lineToRelative(0f, -24f)
            }
        }.build()

        return _SigmaThin!!
    }

@Suppress("ObjectPropertyName")
private var _SigmaThin: ImageVector? = null
