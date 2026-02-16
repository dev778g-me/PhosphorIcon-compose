package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.CellSignalNoneThin: ImageVector
    get() {
        if (_CellSignalNoneThin != null) {
            return _CellSignalNoneThin!!
        }
        _CellSignalNoneThin = ImageVector.Builder(
            name = "Thin.CellSignalNoneThin",
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
                moveTo(40f, 192f)
                lineTo(40f, 200f)
            }
        }.build()

        return _CellSignalNoneThin!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalNoneThin: ImageVector? = null
