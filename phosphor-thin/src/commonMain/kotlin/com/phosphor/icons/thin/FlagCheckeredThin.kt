package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.FlagCheckeredThin: ImageVector
    get() {
        if (_FlagCheckeredThin != null) {
            return _FlagCheckeredThin!!
        }
        _FlagCheckeredThin = ImageVector.Builder(
            name = "Thin.FlagCheckeredThin",
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
                moveTo(168f, 69.48f)
                lineTo(168f, 189.48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 116f)
                curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 42.52f)
                lineTo(104f, 162.52f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 176f)
                curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
                verticalLineTo(56f)
                curveTo(160f, 111.43f, 112f, 0.57f, 48f, 56f)
                verticalLineTo(224f)
            }
        }.build()

        return _FlagCheckeredThin!!
    }

@Suppress("ObjectPropertyName")
private var _FlagCheckeredThin: ImageVector? = null
