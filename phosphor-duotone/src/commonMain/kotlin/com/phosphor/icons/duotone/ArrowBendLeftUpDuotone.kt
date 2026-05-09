package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ArrowBendLeftUpDuotone: ImageVector
    get() {
        if (_ArrowBendLeftUpDuotone != null) {
            return _ArrowBendLeftUpDuotone!!
        }
        _ArrowBendLeftUpDuotone = ImageVector.Builder(
            name = "Duotone.ArrowBendLeftUpDuotone",
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
                moveTo(152f, 80f)
                lineToRelative(-48f, -48f)
                lineToRelative(-48f, 48f)
                lineToRelative(96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 80f)
                lineToRelative(-48f, -48f)
                lineToRelative(-48f, 48f)
                lineToRelative(96f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 224f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, -96f)
                verticalLineTo(80f)
            }
        }.build()

        return _ArrowBendLeftUpDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendLeftUpDuotone: ImageVector? = null
