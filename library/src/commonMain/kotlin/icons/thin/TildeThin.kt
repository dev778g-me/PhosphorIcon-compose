package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.TildeThin: ImageVector
    get() {
        if (_TildeThin != null) {
            return _TildeThin!!
        }
        _TildeThin = ImageVector.Builder(
            name = "Thin.TildeThin",
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
                moveTo(40f, 130.42f)
                curveToRelative(72f, -89.55f, 104f, 84.71f, 176f, -4.84f)
            }
        }.build()

        return _TildeThin!!
    }

@Suppress("ObjectPropertyName")
private var _TildeThin: ImageVector? = null
