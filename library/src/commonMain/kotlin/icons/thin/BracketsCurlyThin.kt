package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.BracketsCurlyThin: ImageVector
    get() {
        if (_BracketsCurlyThin != null) {
            return _BracketsCurlyThin!!
        }
        _BracketsCurlyThin = ImageVector.Builder(
            name = "Thin.BracketsCurlyThin",
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
                moveTo(80f, 40f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 40f)
                curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
                curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
            }
        }.build()

        return _BracketsCurlyThin!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsCurlyThin: ImageVector? = null
