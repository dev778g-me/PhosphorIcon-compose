package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.WebhooksLogoBold: ImageVector
    get() {
        if (_WebhooksLogoBold != null) {
            return _WebhooksLogoBold!!
        }
        _WebhooksLogoBold = ImageVector.Builder(
            name = "Bold.WebhooksLogoBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24.8f, 148f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 108f, 168f)
                horizontalLineToRelative(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196f, 211.82f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, -27.06f, -81.3f)
                lineTo(128f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(167.2f, 44f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, -62.26f, 57.48f)
                lineTo(64f, 168f)
            }
        }.build()

        return _WebhooksLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _WebhooksLogoBold: ImageVector? = null
